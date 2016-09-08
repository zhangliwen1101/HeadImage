package com.example.headimage;

import java.io.File;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends Activity {
	
	private static final int REQUEST_TAKE = 1;
	private static final int REQUEST_PICK = 2;
	private static final int REQUEST_CUTTING = 3;
	private static final int REQUEST_CAMERA = 101;
	private CircleImageView mAvatar;
	private SelectPicPopupWindow mPopupWindow;
	private Button mSelect;
	private Button mSave;
	private RelativeLayout mRoot;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mAvatar = (CircleImageView) findViewById(R.id.civ_avatar);
		mRoot = (RelativeLayout) findViewById(R.id.rl_root);
		
		mSelect = (Button) findViewById(R.id.button);
		mSave = (Button) findViewById(R.id.button2);
		
		initListener();
		
	}
	
	private void initListener() {
		mSelect.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				menu2pic();
			}
		});
		
		mSave.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "保存成功", Toast.LENGTH_SHORT).show();
			}
		});
	}
	
	/**
	 * 选择头像来源
	 */
	private void menu2pic() {
		mPopupWindow = new SelectPicPopupWindow(this, new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				mPopupWindow.dismiss();
				switch (v.getId()) {
					case R.id.takePhotoBtn: // 拍照
						getPermission();
						break;
					
					case R.id.pickPhotoBtn: // 相册选择图片
						selectPic();
						break;
					default:
						break;
				}
			}
		});
		mPopupWindow.showAtLocation(mRoot, Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
		
	}
	
	/**
	 * 获取相机权限
	 */
	private void getPermission() {
//		if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
//				!= PackageManager.PERMISSION_GRANTED) {
//			//申请CAMERA权限
//			ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, REQUEST_CAMERA);
//		} else {
			takePic();
//		}
	}
	
//	@Override
//	public void on(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//		if (REQUEST_CAMERA == requestCode) {
//			if (grantResults.length == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//				takePic();
//			} else {
//				Toast.makeText(this, "必须允许权限才能使用", Toast.LENGTH_SHORT).show();
//			}
//		} else {
//			super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//		}
//	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (requestCode) {
			case REQUEST_TAKE: // 调用相机拍照
				File tempImg = new File(Environment.getExternalStorageDirectory() + "/" + "temp.jpg");
				startPhotoZoom(Uri.fromFile(tempImg));
				break;
			
			case REQUEST_PICK: // 从相册获取照片
				try {
					startPhotoZoom(data.getData());
				} catch (Exception e) { // 用户取消操作 null异常
					e.printStackTrace();
				}
				break;
			
			case REQUEST_CUTTING: // 取得裁剪后的图片
				if (data != null) {
					Bundle extras = data.getExtras();
					if (extras != null) {
						// 取得SDCard图片路径做显示
						Bitmap photo = extras.getParcelable("data");
						mAvatar.setImageBitmap(photo);
					}
				}
				break;
		}
		super.onActivityResult(requestCode, resultCode, data);
	}
	/**
	 * 调用相机拍照
	 */
	private void takePic() {
		Intent takeIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		// 下面这句指定调用相机拍照后的照片存储的路径
		File file = new File(Environment.getExternalStorageDirectory(), "temp.jpg");
		takeIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));
		startActivityForResult(takeIntent, REQUEST_TAKE);
	}
	
	/**
	 * 从相册选择图片
	 */
	private void selectPic() {
		Intent pickIntent = new Intent(Intent.ACTION_PICK, null);
		pickIntent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
		startActivityForResult(pickIntent, REQUEST_PICK);
	}
	
	/**
	 * 裁剪图片方法实现
	 */
	public void startPhotoZoom(Uri uri) {
		Intent intent = new Intent("com.android.camera.action.CROP");
		intent.setDataAndType(uri, "image/*");
		// crop=true是设置在开启的Intent中设置显示的VIEW可裁剪
		intent.putExtra("crop", "true");
		// aspectX aspectY 是宽高的比例
		intent.putExtra("aspectX", 1);
		intent.putExtra("aspectY", 1);
		// outputX outputY 是裁剪图片宽高
		intent.putExtra("outputX", 300);
		intent.putExtra("outputY", 300);
		intent.putExtra("return-data", true);
		startActivityForResult(intent, REQUEST_CUTTING);
	}
}

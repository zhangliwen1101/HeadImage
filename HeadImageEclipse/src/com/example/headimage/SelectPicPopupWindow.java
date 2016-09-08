package com.example.headimage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;


public class SelectPicPopupWindow extends PopupWindow {
	private Button takePhotoBtn, pickPhotoBtn, cancelBtn;
	private View mMenuView;
	
	@SuppressLint("InflateParams")
	public SelectPicPopupWindow(Context context, View.OnClickListener itemsOnClick) {
		super(context);
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		mMenuView = inflater.inflate(R.layout.layout_dialog_pic, null);
		takePhotoBtn = (Button) mMenuView.findViewById(R.id.takePhotoBtn);
		pickPhotoBtn = (Button) mMenuView.findViewById(R.id.pickPhotoBtn);
		cancelBtn = (Button) mMenuView.findViewById(R.id.cancelBtn);
		// 璁剧疆鎸夐挳鐩戝惉
		cancelBtn.setOnClickListener(itemsOnClick);
		pickPhotoBtn.setOnClickListener(itemsOnClick);
		takePhotoBtn.setOnClickListener(itemsOnClick);
		
		// 璁剧疆SelectPicPopupWindow鐨刅iew
		this.setContentView(mMenuView);
		// 璁剧疆SelectPicPopupWindow寮瑰嚭绐椾綋鐨勫
		this.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
		// 璁剧疆SelectPicPopupWindow寮瑰嚭绐椾綋鐨勯珮
		this.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
		// 璁剧疆SelectPicPopupWindow寮瑰嚭绐椾綋鍙偣鍑�
		this.setFocusable(true);
		// 璁剧疆SelectPicPopupWindow寮瑰嚭绐椾綋鍔ㄧ敾鏁堟灉
		this.setAnimationStyle(R.style.PopupAnimation);
		// 瀹炰緥鍖栦竴涓狢olorDrawable棰滆壊涓哄崐閫忔槑
		ColorDrawable dw = new ColorDrawable(0x80000000);
		// 璁剧疆SelectPicPopupWindow寮瑰嚭绐椾綋鐨勮儗鏅�
		this.setBackgroundDrawable(dw);
		// mMenuView娣诲姞OnTouchListener鐩戝惉鍒ゆ柇鑾峰彇瑙﹀睆浣嶇疆濡傛灉鍦ㄩ�夋嫨妗嗗闈㈠垯閿�姣佸脊鍑烘
		mMenuView.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			@SuppressLint("ClickableViewAccessibility")
			public boolean onTouch(View v, MotionEvent event) {
				
				int height = mMenuView.findViewById(R.id.pop_layout).getTop();
				int y = (int) event.getY();
				if (event.getAction() == MotionEvent.ACTION_UP) {
					if (y < height) {
						dismiss();
					}
				}
				return true;
			}
		});
		
	}
}

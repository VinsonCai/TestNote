package com.seewo.testeasinote;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.seewo.commons.utils.NLog;
import com.seewo.commons.utils.NLog.DebugTree;
import com.seewo.libeasinote.shapes.ToolType;
import com.seewo.libeasinote.whiteboard.PlainWhiteboardView;

public class MainActivity extends Activity {

	private PlainWhiteboardView mPlainWhiteboardView;

	private Button mBrushButton;
	private Button mEraserButton;
	private Button mSelectorButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		NLog.plant(new DebugTree());

		setContentView(R.layout.activity_main);

		mPlainWhiteboardView = (PlainWhiteboardView) findViewById(R.id.test_whiteboard);

		mBrushButton = (Button) findViewById(R.id.brush_button);
		mBrushButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				mPlainWhiteboardView.setToolType(ToolType.BRUSH);
			}
		});

		mEraserButton = (Button) findViewById(R.id.eraser_button);
		mEraserButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				mPlainWhiteboardView.setToolType(ToolType.OBJECT_ERASER);
			}
		});

		mSelectorButton = (Button) findViewById(R.id.selector_button);
		mSelectorButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				mPlainWhiteboardView.setToolType(ToolType.SELECTOR);
			}
		});
	}

}

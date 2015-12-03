/*
 * Copyright (C) 2015 Suhan Lee
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.devsh.tdd_android_example;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class ActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mActivity;
    private TextView mTextView;

    public ActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        mActivity = getActivity();
        mTextView = (TextView) mActivity.findViewById(R.id.text_view);
    }

    public void testPreconditions() {
        assertNotNull("mActivity is not null", mActivity);
        assertNotNull("mTextView is not null", mTextView);
    }

    public void testTextViewValue() {
        assertEquals("Hello World!", mTextView.getText());
    }
}

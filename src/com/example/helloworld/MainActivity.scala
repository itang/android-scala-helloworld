package com.example.helloworld

import android.os.Bundle
import android.app.Activity
import android.view.Menu
import android.widget.TextView

class MainActivity extends Activity {

  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val hello = findViewById(R.id.hello).asInstanceOf[TextView]
    hello.setText(hello.getText + " 世界!")
  }

  override def onCreateOptionsMenu(menu: Menu): Boolean = {
    getMenuInflater().inflate(R.menu.activity_main, menu)
    true
  }
}

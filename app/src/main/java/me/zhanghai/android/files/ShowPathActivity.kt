package me.zhanghai.android.files

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.fragment.app.commit
import me.zhanghai.android.files.app.AppActivity
import me.zhanghai.android.files.filelist.FileListActivity
import me.zhanghai.android.files.filelist.FileListFragment
import me.zhanghai.android.files.filelist.FileListViewModel
import me.zhanghai.android.files.util.extraPath
import me.zhanghai.android.files.util.putArgs
import me.zhanghai.android.files.util.args
import me.zhanghai.android.files.util.viewModels


class ShowPathActivity : AppActivity() {
    //private val args by args<FileListFragment.Args>()
    //private val argsPath by lazy { args.intent.extraPath }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_path)
        /*if (savedInstanceState == null) {
            fragment = FileListFragment().putArgs(FileListFragment.Args(intent))
            supportFragmentManager.commit { add(android.R.id.content, fragment) }
        } else {
            fragment = supportFragmentManager.findFragmentById(android.R.id.content)
                    as FileListFragment
        }*/
        var textview:TextView=findViewById(R.id.pathShow)
        textview.setText(Environment.getExternalStorageDirectory().getAbsolutePath())
        //textview.setText(argsPath.toString())
        var Back: Button =findViewById(R.id.Back)
        Back.setOnClickListener {
           var intent = Intent(this,FileListActivity::class.java)
            startActivity(intent)
        }
    }

}
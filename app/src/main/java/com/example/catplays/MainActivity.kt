package com.example.catplays

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import android.view.View
import android.view.animation.Animation
import com.example.catplays.define_class.Song
import kotlinx.android.synthetic.main.activity_main.*


//    var arraySong: ArrayList<Song>
//    val isPlaying = false
//    val myRotation: Animation
private val mediaPlayer: MediaPlayer? = null

class MainActivity : AppCompatActivity() {
//    val isInit = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        addSong();
        initMediaPlayer();
//        imgPlay.setOnClickListener(View
    }

    private fun addSong() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

//        arraySong.add(Song("Nơi Này có anh"), assets)
    }

    private fun initMediaPlayer() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        mediaPlayer = MediaPlayer.create(this, "D:\\Project\\Android\\CatPlays\\app\\src\\assets\\noinaycoanh.mp3")
        mediaPlayer.start();
    }

    private fun addEvent() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        /* Play music */
//        imgPlay.setOnClickListener(object : View.OnClickListener() {
//            fun onClick(v: View) {
//                if (isPlaying) {
//                    imgPlay.setImageResource(R.drawable.ic_player_play)
//                    isPlaying = false
//                    pauseMusic()
//                    myRotation.cancel()
//                    myRotation.reset()
//
//                } else {
//                    isPlaying = true
//                    imgPlay.setImageResource(R.drawable.ic_player_pause)
//                    playMusic()
//                    imgSinger.startAnimation(myRotation)
//                }
//            }
//        })
    }
//
//    private fun addControls() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
}

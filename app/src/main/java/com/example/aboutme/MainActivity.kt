package com.example.aboutme

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupPerson(
            emailView = findViewById(R.id.email1),
            youtubeView = findViewById(R.id.youtube_icon1),
            githubView = findViewById(R.id.github_icon1),
            facebookView = findViewById(R.id.facebook_icon1),
            email = "karlamae2005@gmail.com",
            youtubeUrl = "https://www.youtube.com/@foreecasttt6650",
            githubUrl = "https://github.com/Historia2005/karlaalo-ot",
            facebookUrl = "https://www.facebook.com/karla.reiss.2025"
        )

        setupPerson(
            emailView = findViewById(R.id.email2),
            youtubeView = findViewById(R.id.youtube_icon2),
            githubView = findViewById(R.id.github_icon2),
            facebookView = findViewById(R.id.facebook_icon2),
            email = "johndoe@gmail.com",
            youtubeUrl = "20170012260@my.xu.edu.ph",
            githubUrl = "https://github.com/johndoe",
            facebookUrl = "https://www.facebook.com/marieeeeeeee333eeee33"
        )

        setupPerson(
            emailView = findViewById(R.id.email3),
            youtubeView = findViewById(R.id.youtube_icon3),
            githubView = findViewById(R.id.github_icon3),
            facebookView = findViewById(R.id.facebook_icon3),
            email = "20230029057@my.xu.edu.ph",
            youtubeUrl = "https://www.youtube.com/@janesmith",
            githubUrl = "https://github.com/nadjahdimaporo",
            facebookUrl = "https://www.facebook.com/nadjah.d.dimaporo"
        )

        setupPerson(
            emailView = findViewById(R.id.email4),
            youtubeView = findViewById(R.id.youtube_icon4),
            githubView = findViewById(R.id.github_icon4),
            facebookView = findViewById(R.id.facebook_icon4),
            email = "20230028304@my.xu.edu.ph",
            youtubeUrl = "https://www.youtube.com/@michaellee",
            githubUrl = "https://github.com/xgigil",
            facebookUrl = "https://www.facebook.com/gailleanne.loking"
        )

        setupPerson(
            emailView = findViewById(R.id.email5),
            youtubeView = findViewById(R.id.youtube_icon5),
            githubView = findViewById(R.id.github_icon5),
            facebookView = findViewById(R.id.facebook_icon5),
            email = "20230028975@my.xu.edu.ph",
            youtubeUrl = "https://www.youtube.com/@sarahtan",
            githubUrl = "https://github.com/johnpaulnob08",
            facebookUrl = "https://www.facebook.com/johnpaul.nob"
        )
    }

    private fun setupPerson(
        emailView: TextView,
        youtubeView: ImageView,
        githubView: ImageView,
        facebookView: ImageView,
        email: String,
        youtubeUrl: String,
        githubUrl: String,
        facebookUrl: String
    ) {
        emailView.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:$email")
            }
            startActivity(Intent.createChooser(emailIntent, "Send Email"))
        }

        youtubeView.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(youtubeUrl))
            startActivity(intent)
        }

        githubView.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(githubUrl))
            startActivity(intent)
        }

        facebookView.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl))
            startActivity(intent)
        }
    }
}

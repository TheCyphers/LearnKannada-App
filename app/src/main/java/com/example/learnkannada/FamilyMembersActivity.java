package com.example.learnkannada;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

//public class FamilyMembersActivity extends AppCompatActivity {
//
//    private MediaPlayer mMediaPlayer;
//
//    private MediaPlayer.OnCompletionListener mCompletionListner = new MediaPlayer.OnCompletionListener() {
//        @Override
//        public void onCompletion(MediaPlayer mp) {
//            releaseMediaPlayer();
//        }
//    };
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_numbers);
//
//       final  ArrayList<Word> words = new ArrayList<Word>();
//        words.add(new Word("father", "әpә",R.drawable.family_father,R.raw.family_father));
//        words.add(new Word("mother", "әṭa",R.drawable.family_mother,R.raw.family_mother));
//        words.add(new Word("son", "angsi",R.drawable.family_son,R.raw.family_son));
//        words.add(new Word("daughter", "tune",R.drawable.family_daughter,R.raw.family_daughter));
//        words.add(new Word("older brother", "taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
//        words.add(new Word("younger brother", "chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
//        words.add(new Word("older sister", "teṭe",R.drawable.family_older_sister,R.raw.family_older_sister));
//        words.add(new Word("younger sister", "kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
//        words.add(new Word("grandmother ", "ama",R.drawable.family_grandmother,R.raw.family_grandmother));
//        words.add(new Word("grandfather", "paapa",R.drawable.family_grandfather,R.raw.family_grandfather));
//
//        WordAdapter adapter = new WordAdapter(this, words,R.color.category_family);
//
//        ListView listView = (ListView) findViewById(R.id.list);
//
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
////                Toast.makeText(NumbersActivity.this,"ListItem Clicked",Toast.LENGTH_SHORT).show();
//                Word word = words.get(position);
//                // Release the media player if it currnetly exists because we are about to
//                //play a diffrent sound file.
//                releaseMediaPlayer();
//
//                mMediaPlayer = MediaPlayer.create(FamilyMembersActivity.this,word.getAudioResourceId());
//                mMediaPlayer.start();
//
//            }
//        });
//    }
//    @Override
//    protected void onStop(){
//        super.onStop();
////        when the activity is stopped , release  the media player resources because we wont
////                be playing any more sounds.
//        releaseMediaPlayer();
//    }
//
//    private void releaseMediaPlayer() {
//        // If the media player is not null, then it may be currently playing a sound.
//        if (mMediaPlayer != null) {
//            // Regardless of the current state of the media player, release its resources
//            // because we no longer need it.
//            mMediaPlayer.release();
//
//            // Set the media player back to null. For our code, we've decided that
//            // setting the media player to null is an easy way to tell that the media player
//            // is not configured to play an audio file at the moment.
//            mMediaPlayer = null;
//        }
//    }
//}


//REPLACING FOR FRAGMENTS


public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new FamilyMembersFragment())
                .commit();
    }
}
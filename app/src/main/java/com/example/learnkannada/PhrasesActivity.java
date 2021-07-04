package com.example.learnkannada;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

//public class PhrasesActivity extends AppCompatActivity {
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
////        setContentView(R.layout.activity_phrases);
//        setContentView(R.layout.activity_numbers);
//
//        final ArrayList<Word> words = new ArrayList<Word>();
//        words.add(new Word("Where are you going?", "minto wuksus",R.raw.phrase_where_are_you_going));
//        words.add(new Word("What is your name?", "tinnә oyaase'nә",R.raw.phrase_what_is_your_name));
//        words.add(new Word("My name is...", "oyaaset...",R.raw.phrase_my_name_is));
//        words.add(new Word("How are you feeling?", "michәksәs?",R.raw.phrase_how_are_you_feeling));
//        words.add(new Word("I’m feeling good.", "kuchi achit",R.raw.phrase_im_feeling_good));
//        words.add(new Word("Are you coming?", "әәnәs'aa?",R.raw.phrase_are_you_coming));
//        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm",R.raw.phrase_yes_im_coming));
//        words.add(new Word("I’m coming.", "әәnәm",R.raw.phrase_im_coming));
//        words.add(new Word("Let’s go.", "yoowutis",R.raw.phrase_lets_go));
//        words.add(new Word("Come here.", "әnni'nem",R.raw.phrase_come_here));
//
//        WordAdapter adapter = new WordAdapter(this, words,R.color.category_phrases);
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
//                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this,word.getAudioResourceId());
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


public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new PhrasesFragment())
                .commit();
    }
}
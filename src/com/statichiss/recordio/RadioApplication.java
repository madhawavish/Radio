package com.statichiss.recordio;

import android.app.Application;
import android.media.MediaPlayer;

public class RadioApplication extends Application {

    private RadioDetails _playingStation;
    private RadioDetails _recordingStation;
    private MediaPlayer _mediaPlayer;

    public static final int StartPlayingRadio = 1;
    public static final int PausePlayingRadio = 2;
    public static final int ResumePlayingRadio = 3;
    public static final int StopPlayingRadio = 4;

    public MediaPlayer getMediaPlayer() {
        return _mediaPlayer;
    }

    public void setMediaPlayer(MediaPlayer mediaPlayer) {
        this._mediaPlayer = mediaPlayer;
    }

    public RadioDetails getPlayingStation() {
        return _playingStation;
    }

    public void setPlayingStation(RadioDetails playingStation) {
        _playingStation = playingStation;
    }

    public RadioDetails getRecordingStation() {
        return _recordingStation;
    }

    public void setRecordingStation(RadioDetails recordingStation) {
        _recordingStation = recordingStation;
    }
}

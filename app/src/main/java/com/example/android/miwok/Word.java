package com.example.android.miwok;

/**
 * Created by Beast on 1/7/2018.
 */

public class Word {
    private String englishWord;
    private String miwokWord;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int image_resource_id = NO_IMAGE_PROVIDED;
    private int audio_resource_id;

    public Word(String e, String m) {
        miwokWord = m;
        englishWord = e;
    }
    public Word(String e, String m, int audioId) {
        miwokWord = m;
        englishWord = e;
        audio_resource_id = audioId;
    }
    public Word(String e, String m, int imageId, int audioId) {
        miwokWord = m;
        englishWord = e;
        image_resource_id = imageId;
        audio_resource_id = audioId;
    }
    public String getMiwokWord() {
        return miwokWord;
    }
    public String getTranslation() {
        return englishWord;
    }
    public int getImageRosourceID() { return image_resource_id;}
    public int getAudioRosourceID() { return audio_resource_id;}

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return image_resource_id != NO_IMAGE_PROVIDED;
    }
}

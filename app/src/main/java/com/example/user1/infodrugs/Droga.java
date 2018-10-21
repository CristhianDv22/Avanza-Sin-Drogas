package com.example.user1.infodrugs;

public class Droga {

    private static final String LARGE_BASE_URL = "http://storage.googleapis.com/androiddevelopers/sample_data/activity_transition/large/";
    private static final String THUMB_BASE_URL = "http://storage.googleapis.com/androiddevelopers/sample_data/activity_transition/thumbs/";

    public static Droga[] ITEMS = new Droga[] {
            new Droga("Cigarrillo", "", R.drawable.cigarrillo,R.string.Cigarrillo),
            new Droga("Marihuana",        "", R.drawable.marihuana,R.string.Marihuana),
            new Droga("2-CB", "", R.drawable.doscb,R.string.dos_cb),
            new Droga("Kokodril", "", R.drawable.kokodril,R.string.kokodril),
            new Droga("Barbituricos", "", R.drawable.barbituricos,R.string.barturicos),
            new Droga("Inhalantes", "",R.drawable.inhalantes,R.string.inhalantes),

    };

    public static Droga getDroga(int id) {
        for (Droga Droga : ITEMS) {
            if (Droga.getmPhoto() == id) {
                return Droga;
            }
        }
        return null;
    }

    private final String mName;
    private final String mAuthor;

    public int getmPhoto() {
        return mPhoto;
    }

    private int mPhoto;

    public int getmDescription() {
        return mDescription;
    }

    private int mDescription;
    //private final String mFileName;

    Droga (String name, String author, int photo, int description) {
        mName = name;
        mAuthor = author;
        mPhoto = photo;
        mDescription =description;
    }

    //public int getId() {
    //    return mName.hashCode() + mFileName.hashCode();
    //}

    public String getAuthor() {
        return mAuthor;
    }

    public String getName() {
        return mName;
    }

    //public String getPhotoUrl() {
   //     return LARGE_BASE_URL + mFileName;
   // }

    //public String getThumbnailUrl() {
     //   return THUMB_BASE_URL + mFileName;
   // }
}

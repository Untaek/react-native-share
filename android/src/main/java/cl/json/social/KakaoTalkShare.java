package cl.json.social;

import android.content.ActivityNotFoundException;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/**
 * Created by Untaek on 24-10-07.
 */
public class KakaoTalkShare extends SingleShareIntent {

    private static final String PACKAGE = "com.kakao.talk";
    private static final String PLAY_STORE_LINK = "https://play.google.com/store/apps/details?id=com.kakao.talk";

    public KakaoTalkShare(ReactApplicationContext reactContext) {
        super(reactContext);
    }
    @Override
    public void open(ReadableMap options) throws ActivityNotFoundException {
        super.open(options);
        //  extra params here
        this.openIntentChooser();
    }
    @Override
    protected String getPackage() {
        return PACKAGE;
    }

    @Override
    protected String getDefaultWebLink() {
        return null;
    }

    @Override
    protected String getPlayStoreLink() {
        return PLAY_STORE_LINK;
    }
}


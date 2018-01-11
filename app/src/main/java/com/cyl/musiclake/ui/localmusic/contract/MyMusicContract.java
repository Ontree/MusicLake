package com.cyl.musiclake.ui.localmusic.contract;

import com.cyl.musiclake.ui.base.BasePresenter;
import com.cyl.musiclake.ui.base.BaseView;
import com.cyl.musiclake.data.model.Music;
import com.cyl.musiclake.data.model.Playlist;

import java.util.List;

public interface MyMusicContract {

    interface View extends BaseView {

        void showSongs(List<Music> songList);

        void showEmptyView();

        void showPlaylist(List<Playlist> playlists);
    }

    interface Presenter extends BasePresenter<View> {
        void loadSongs();

        void loadPlaylist();
    }
}

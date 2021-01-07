package com.music.forum.Controllers;

import java.util.*;

import com.music.forum.Models.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SongController {
    static ArrayList<Song> songs = new ArrayList<>();

    @RequestMapping(value="")
    public String home(Model model){
        model.addAttribute("songs",songs);
        model.addAttribute("pagetitle","Home");
        return "home";
    }
    @RequestMapping(value="addsong", method = RequestMethod.GET)
    public String displaySongs(Model model){
        model.addAttribute("songs", songs);
        model.addAttribute("pagetitle","Songs");
        return "addsong";
    }
    @RequestMapping(value="addsong", method = RequestMethod.POST)
    public void addSong(Model model, @RequestParam String songName, @RequestParam String artistName){
        model.addAttribute("songs", songs);
        songs.add(new Song(songName, artistName));
    }

    /*@RequestMapping(value="addsong", method = RequestMethod.POST)
    public void removeSong(@RequestParam String songName){
        for(String cheese : )
        songs.remove(songName);
    }*/
}

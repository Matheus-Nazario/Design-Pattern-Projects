package br.com.bridge;

import br.com.bridge.platforms.Facebook;
import br.com.bridge.platforms.IPlatform;
import br.com.bridge.platforms.TwitchTV;
import br.com.bridge.platforms.Youtube;
import br.com.bridge.trasmission.AdvancedLive;

public class Main {
    public static void main(String[] args) {

        startLive(new Youtube());
        startLive(new TwitchTV());
        startLive(new Facebook());



    }

    public static void startLive(IPlatform platform){
        System.out.println("....Aguarde!");
//        Live live = new Live(platform);
//        live.broadcasting();
//        live.result();

        // Transmissaão avançada
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.result();
        advancedLive.subtitles();
    }
}
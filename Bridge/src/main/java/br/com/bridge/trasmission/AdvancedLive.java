package br.com.bridge.trasmission;

import br.com.bridge.platforms.IPlatform;

public class AdvancedLive extends Live{
    public AdvancedLive(IPlatform platform){
        super.platform = platform;
    }

    public void subtitles(){
        System.out.println("Legendas ativadas");
    }


    public void comments(){
        System.out.println("comentarios liberado na live");
    }
}

package Array;

public class remote {
    private int channel, vol, brightness, signal;
    private boolean power, avi;

    public remote()
    {
        channel=0;
        vol=0;
        power=false;
        avi=true;
        brightness=50;
        signal=114;
    }
    public int getvol()
    {
        return vol;
    }
    public int getchannel()
    {
        return channel;
    }
    public boolean getpower()
    {
        return power;
    }
    public boolean getavi()
    {
        return avi;
    }
    public void volp()
    {
        vol=vol+1;
    }
    public void volm()
    {
        vol=vol-1;
    }
    public void chp()
    {
        channel=channel+1;
    }
    public void chm()
    {
        channel=channel-1;
    }
    public void chset(int ch)
    {
        channel=ch;
    }
    public void powerset()
    {
        if(!power) power=true;
        else power=false;
    }
    public void aviset()
    {
        if(!avi) avi=true;
        else avi=false;
    }
}

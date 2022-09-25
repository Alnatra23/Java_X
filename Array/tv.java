package Array;

public class tv {
    public void tampil(int channel,int volume)
    {
        System.out.println("==================");
        System.out.println("Channel: "+channel);
        System.out.println("==================");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.print("Volume:");
        for(int i=0;i<volume;i=i+1){System.out.print("|");}
        System.out.println("\n==================");
    }
    public void mati()
    {
        System.out.println("==================");
        System.out.println("    NO SIGNAL");
        System.out.println("==================");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.print("");
        System.out.println("\n==================");
    }
}

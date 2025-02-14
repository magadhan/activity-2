public class Artist {
    private String name;
    private int numFans;
    public Artist(){
    // add code here
        this.name = "Athira";
        this.numFans = 34;
        
    }
    public Artist(String name, int numFans){
    // add code here
        this.name = name;
        this.numFans = numFans;
    }
    public Artist(Artist anotherArtist) {
    // add code here
        this.name = anotherArtist.name;
        this.numFans = anotherArtist.numFans;
    }
    public void setInfo(String name, int numFans){
    // add code here
        this.name = name;
        this.numFans = numFans;
    }
    // add any other suitable code as you see fit
    
    }
    

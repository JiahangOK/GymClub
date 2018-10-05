package forcoach;

public class Coach {
    private String cname;
    private int imageId;

    public Coach(String cname,int imageId){
        this.cname=cname;
        this.imageId=imageId;
    }
    public String getName(){
        return cname;
    }
    public int getImageId(){
        return imageId;
    }
}

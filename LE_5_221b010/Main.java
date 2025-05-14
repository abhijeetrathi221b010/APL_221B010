class Main{
    public static void main(String[] args){
        Whisky whisky= new Whisky();
        Beer beer = new Beer();
        Rum rum= new Rum();
        System.out.println("How to make Whisky?");
        whisky.templateM(30, 2);
        System.out.println("");
        System.out.println("How to make Beer?");
        beer.templateM(300,0);
        System.out.println("");
        System.out.println("How to make Rum?");
        rum.templateM(60, 1);
    }
}
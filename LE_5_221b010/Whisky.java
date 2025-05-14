class Whisky extends Beverage{
    protected void addCondiment(){
        System.out.println("Add Ice");
    };
    protected void Stir(int time){
        System.out.println("Stir for "+ time +" minutes");
    }
    
}
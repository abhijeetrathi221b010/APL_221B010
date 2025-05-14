abstract class Beverage{
    private void pour(int amount){
        System.out.println("Add "+ amount +" ml of Beverage");
    }
    abstract void addCondiment();
    protected void Stir(int time){}
    private void serve(){
        System.out.println("Serve the Beverage to the customer.");
    }
    public void templateM(int amount_,int time_){
        pour(amount_);
        addCondiment();
        Stir(time_);
        serve();
    }
    
}
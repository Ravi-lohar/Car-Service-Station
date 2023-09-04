public class Sedan implements CarServiceStation {
    private int BS01 = 4000 ;
    private int EF01 = 8000 ;
    private int CF01 = 4000 ;
    private int BF01 = 1500 ;
    private int GF01 = 6000 ;
    @Override
    public int basicServicing(){
        return BS01 ;
    } ;
    @Override
    public int engineFixing() {
        return EF01 ;
    }
    @Override
    public int clutchFixing() {
        return CF01 ;
    }
    @Override
    public int breakFixing(){
        return BF01 ;
    };
    @Override
    public int gearFixing(){
        return GF01 ;
    };
}

public class SUV implements CarServiceStation{

    private int BS01 = 5000 ;
    private int EF01 = 10000 ;
    private int CF01 = 6000 ;
    private int BF01 = 2500 ;
    private int GF01 = 8000 ;
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

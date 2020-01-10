/**
 * @Author: YanL
 * @Time: 15:24 2019/12/5
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public enum SecurityCategory {
    //
    STOCK(Security.Stock.class), BOND(Security.Bond.class);
    Security[] values;
    SecurityCategory(Class<? extends Security> kind){
        values = kind.getEnumConstants();
    }

    Security randomSelection(){
        return Enums.random(values);
    }
    interface Security{
        enum Stock implements Security { SHORT, LONG, MARGIN }
        enum Bond implements Security { MUNICIPAL, JUNK }
    }

    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            SecurityCategory securityCategory = Enums.random(SecurityCategory.class);
            System.out.println(securityCategory + " : " + securityCategory.randomSelection());
        }
    }


}

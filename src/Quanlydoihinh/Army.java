package Quanlydoihinh;
import java.util.*;
public class Army {
    List<Object> siu=new ArrayList<>();

    //them lin vao doi quan
    public void addUnit(Object unit){
        siu.add(unit);
    }

    //goi binh linh tan cong
    public void executeAttack(){
        for (Object until : siu){
            if(until instanceof MeleeFighter){
                ((MeleeFighter) until).attackMelee();
            }

            if (until instanceof RangedFighter){
                ((RangedFighter) until).attackRanged();
            }

            if (until instanceof MagicUser){
                ((MagicUser) until).castSpell();
            }
        }
    }

}

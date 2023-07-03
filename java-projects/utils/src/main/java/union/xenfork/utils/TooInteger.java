package union.xenfork.utils;

import org.jetbrains.annotations.NotNull;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigInteger;

public class TooInteger implements Serializable {

    @Serial
    private static final long serialVersionUID = -7343907856428713228L;
    public Integer cbr, dbr, nbr, bbr, ybr, zbr, ebr, pbr, tbr, gbr, mbr, kbr, br, bitr;//寄存器
    //用于寄存计算冗余量
    public int cb = 0, db= 0, nb= 0, bb= 0, yb= 0, zb= 0, eb= 0, pb= 0, tb= 0, gb= 0, mb= 0, kb= 0, b= 0, bit= 0;


    // 存储单位算数法

    public TooInteger(@NotNull Integer integer) {
        int mod = 0, level = 0;
        if (integer >= 8) {
            bs[0] = integer % 8;
            
            save();
        } else {
            bs[0] = integer;
            save();
        }
    }
    public int[] bs = new int[] {
            bit, b, kb, mb, gb, tb, pb, eb, zb, yb, bb, nb, db, cb
    };
    public void save() {
        bit = bs[0];
        b = bs[1];
        kb = bs[2];
        mb = bs[3];
        gb = bs[4];
        tb = bs[5];
        pb = bs[6];
        eb = bs[7];
        zb = bs[8];
        yb = bs[9];
        bb = bs[10];
        nb = bs[11];
        db = bs[12];
        cb = bs[13];
    }
}

import org.apache.hadoop.hive.ql.exec.UDF;

public class HiveUdf extends UDF {
    public String evaluate (String s){
        if (s == null){
            return null;
        }
        return s.toLowerCase();

    }
}


/**
 * Created by Vilkas on 15/09/2017.
 */
public class DoubleUtils {

    public static boolean areEqual(Double oldValue, Double newValue) {
        return (null == oldValue) ^ (null == newValue)||
               ((null != oldValue && null != newValue) &&
               Double.compare(oldValue, newValue) != 0);
    }

//    public static boolean areEqual(Double oldValue, Double newValue) {
//        boolean oldValueNullNewValueNotNull = (oldValue == null) && (newValue != null);
//        boolean oldValueNotNullNewValueNull = (oldValue != null) && (newValue == null);
//        boolean exactlyOneValueNull = oldValueNullNewValueNotNull || oldValueNotNullNewValueNull;
//        boolean bothValuesNotNull = (oldValue != null) && (newValue != null);
//        return (exactlyOneValueNull || (bothValuesNotNull && (!oldValue.equals(newValue))));
//    }

}

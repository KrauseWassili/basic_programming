package app1;

import java.util.Comparator;
import java.util.List;

public class SortAutos {

    private static Comparator<Auto> comparatorById = (Auto a1, Auto a2 ) -> {return Integer.compare(a1.getId(),a2.getId());};
    private static Comparator<Auto> comparatorByBrand = (Auto a1, Auto a2 ) -> {return a1.getBrand().compareTo(a2.getBrand());};
    private static Comparator<Auto> comparatorByYear = (Auto a1, Auto a2 ) -> {return Integer.compare(a1.getYear(),a2.getYear());};
    private static Comparator<Auto> comparatorByPrice = (Auto a1, Auto a2 ) -> {return Double.compare(a1.getPrice(),a2.getPrice());};
    private static Comparator<Auto> comparatorByPriceDescending = comparatorByPrice.reversed();

    public static void sortBy (List<Auto> autoList, int criterion){
        switch (criterion){
            case 1: autoList.sort(comparatorById); break;
            case 2: autoList.sort(comparatorByBrand); break;
            case 3: autoList.sort(comparatorByYear); break;
            case 4: autoList.sort(comparatorByPrice); break;
            case 5: autoList.sort(comparatorByPriceDescending); break;
            default:
        }
    }
}

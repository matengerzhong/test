import java.beans.BeanInfo;


import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import com.google.common.collect.Lists;


public class MapUtils {

	
	
	
	
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		
		
		
		Object a = 2.212f;
		
		
		System.out.println((Float)a+1);
		
		
	}
	
	
	 /**
     * 
     * 描述：获取逾重行李默认查询日期区间
     * 
     * @return
     */
    public static Map<String,String> getDefaultStartAndEndDate() {
    	
    	Map<String,String> perDate = new HashMap<>();
    	
        SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calEndDate = Calendar.getInstance();
        
        int day = calEndDate.get(Calendar.DATE);
        
        calEndDate.setTime(new Date());
        // 每个月的11号到20号为中旬 ,如果当前日期是本月的中旬，则查询上个月的8天的数据，如果不是中旬则查询上上个月的8天的数据
        calEndDate.add(Calendar.MONTH, day>=11?-1:-2);
        
        calEndDate.set(Calendar.DAY_OF_MONTH, calEndDate.getActualMaximum(Calendar.DAY_OF_MONTH));
        perDate.put("endDate", dft.format(calEndDate.getTime()));
        
        
        Calendar calStartDate = Calendar.getInstance();
        
        calStartDate.setTime(calEndDate.getTime());
        // 设置本月最后一天前一周日期
        calStartDate.add(Calendar.DATE, -7);
        
        perDate.put("startDate", dft.format(calStartDate.getTime()));
        
        return perDate;
    }

	
	
}

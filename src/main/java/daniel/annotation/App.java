package daniel.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;




public class App 
{
    public static void main( String[] args )
    {
    	INTEL intel = new INTEL();
		AMD amd = new AMD();
		MSI msi = new MSI();
		ASUS asus = new ASUS();
		
		Class clazz1  = intel.getClass();
		Class clazz2  = amd.getClass();
		Class clazz3  = msi.getClass();
		Class clazz4  = asus.getClass();
		
		Annotation[] ann = clazz1.getAnnotations();
		String nameCPUSocket1 = "";
		String nameCPUSocket2 = "";
		String CPUchipset1 = "";
		String CPUchipset2 = "";
		String model1 = "";
		String model2 = "";
		String mark1 = "";
		String mark2 = "";
		String chipset1 = "";
		String chipset2 = "";
		for(Annotation a : ann) 
		{
			if(a instanceof CPUSocket) 
			{
				CPUSocket cpuSocket = (CPUSocket) a;
				
				nameCPUSocket1 = cpuSocket.name();
			}
		}
		ann = clazz2.getAnnotations();
		for(Annotation a : ann) 
		{
			if(a instanceof CPUSocket) 
			{
				CPUSocket cpuSocket = (CPUSocket) a;
				
				nameCPUSocket2 = cpuSocket.name();
			}
		}
		
			try {
				
				
				Method methodSet = clazz3.getMethod("setMark", String.class);
				methodSet.invoke(msi, "MSI");
				Method methodGet = clazz3.getMethod("getMark");
				mark1 = (String)methodGet.invoke(msi); 
				methodSet = clazz3.getMethod("setModel", String.class);
				methodSet.invoke(msi, "Z390-A Pro");
				methodGet = clazz3.getMethod("getModel");
				model1 = (String) methodGet.invoke(msi);
				ann = clazz3.getAnnotations();
				for(Annotation a : ann) 
				{
					if(a instanceof ChipSet) 
					{
						ChipSet chipSet = (ChipSet) a;
						
						chipset1 = chipSet.type();
					}
				}
				Method methodSet1 = clazz4.getMethod("setMark", String.class);
				methodSet1.invoke(asus, "ASUS");
				Method methodGet1 = clazz4.getMethod("getMark");
				mark2 = (String) methodGet1.invoke(asus); 
				methodSet1 = clazz4.getMethod("setModel", String.class);
				methodSet1.invoke(asus, "Rog Maximus X Formula");
				methodGet1 = clazz4.getMethod("getModel");
				model2 = (String) methodGet1.invoke(asus); 
				ann = clazz4.getAnnotations();
				for(Annotation a : ann) 
				{
					if(a instanceof ChipSet) 
					{
						ChipSet chipSet = (ChipSet) a;
						
						chipset2 = chipSet.type();
					}
				}
			} catch (NoSuchMethodException | SecurityException | IllegalAccessException 
					| IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Mark: " + mark1 + "; Model: "+model1 +"; Chip: " +chipset1 + "\nMark: "+mark2+"; Model: "+model2+"; Chip: "+ chipset2);
			
			
		
			try {
				Method methodSet = clazz1.getMethod("setChipset", String.class);
				methodSet.invoke(intel, "z170");
				Method methodGet = clazz1.getMethod("getChipset");
				CPUchipset1 = (String)methodGet.invoke(intel); 
				methodSet = clazz2.getMethod("setChipset", String.class);
				methodSet.invoke(amd, "X470");
				methodGet = clazz2.getMethod("getChipset");
				CPUchipset2 = (String)methodGet.invoke(amd); 
				
			} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			System.out.println("Intel chipset: " + CPUchipset1);
			System.out.println("AMD chipset: " + CPUchipset2);
			
			if(CPUchipset1.equals(chipset1)) 
			{
				System.out.println("Intel and msi compatible");
			}else
				if(CPUchipset1.equals(chipset2)) 
				{
					System.out.println("Intel and asus compatible");
				}
			if(CPUchipset2.equals(chipset1)) 
			{
				System.out.println("AMD and msi compatible");
			}else
				if(CPUchipset2.equals(chipset2)) 
				{
					System.out.println("AMD and asus compatible");
				}
	}
	
    }



@Configuration
@ComponentScan({"com.satender"})
public class SatenderConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver() 
	{
		InternalResourceViewResolver vr= new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		return vr;
	}
}
	

}

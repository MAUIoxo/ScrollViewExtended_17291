package mono.android.app;

public class ApplicationRegistration {

	public static void registerApplications ()
	{
				// Application and Instrumentation ACWs must be registered first.
		mono.android.Runtime.register ("ScrollViewGettingExtendedApp.MainApplication, ScrollViewGettingExtendedApp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", crc64ebf95bd314857e1a.MainApplication.class, crc64ebf95bd314857e1a.MainApplication.__md_methods);
		mono.android.Runtime.register ("Microsoft.Maui.MauiApplication, Microsoft.Maui, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", crc6488302ad6e9e4df1a.MauiApplication.class, crc6488302ad6e9e4df1a.MauiApplication.__md_methods);
		
	}
}

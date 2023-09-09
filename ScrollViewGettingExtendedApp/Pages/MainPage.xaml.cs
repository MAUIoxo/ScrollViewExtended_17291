using ScrollViewGettingExtendedApp.ViewModels;

namespace ScrollViewGettingExtendedApp.Pages;

public partial class MainPage : ContentPage
{
    public MainPage(MainPageViewModel viewModel)
    {
        InitializeComponent();

        BindingContext = viewModel;
    }

    protected override void OnAppearing()
    {
        Shell.SetTabBarIsVisible(this, false);
    }
}
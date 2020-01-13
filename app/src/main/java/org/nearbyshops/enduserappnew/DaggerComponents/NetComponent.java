package org.nearbyshops.enduserappnew.DaggerComponents;


import dagger.Component;

import org.nearbyshops.enduserappnew.EditItemCategory.EditItemCategoryFragment;
import org.nearbyshops.enduserappnew.EditShopStaffPermissions.AddUserToStaffDialog;
import org.nearbyshops.enduserappnew.EditShopStaffPermissions.EditShopStaffPermissionsFragment;
import org.nearbyshops.enduserappnew.EditStaffPermissions.EditStaffPermissionsFragment;
import org.nearbyshops.enduserappnew.aSellerModule.DeliveryPersonInventory.Fragment.DeliveryInventoryFragment;
import org.nearbyshops.enduserappnew.adminModule.AddCredit.FragmentAddCredit;
import org.nearbyshops.enduserappnew.adminModule.AdminDashboard.AdminDashboardFragment;
import org.nearbyshops.enduserappnew.EditServiceConfig.EditConfigurationFragment;
import org.nearbyshops.enduserappnew.CartItemList.CartItemAdapter;
import org.nearbyshops.enduserappnew.CartItemList.CartItemListActivity;
import org.nearbyshops.enduserappnew.CartsList.CartsListFragment;
import org.nearbyshops.enduserappnew.Checkout.PlaceOrderActivity;
import org.nearbyshops.enduserappnew.DaggerModules.AppModule;
import org.nearbyshops.enduserappnew.DaggerModules.NetModule;
import org.nearbyshops.enduserappnew.DeliveryAddress.DeliveryAddressActivity;
import org.nearbyshops.enduserappnew.EditAddress.EditAddressFragment;
import org.nearbyshops.enduserappnew.EditItem.EditItemFragmentNew;
import org.nearbyshops.enduserappnew.EditItemImage.EditItemImageFragment;
import org.nearbyshops.enduserappnew.EditProfile.ChangeEmail.FragmentChangeEmail;
import org.nearbyshops.enduserappnew.EditProfile.ChangeEmail.FragmentVerifyEmail;
import org.nearbyshops.enduserappnew.EditProfile.ChangePassword.FragmentChangePassword;
import org.nearbyshops.enduserappnew.EditProfile.ChangePhone.FragmentChangePhone;
import org.nearbyshops.enduserappnew.EditProfile.ChangePhone.FragmentVerifyPhone;
import org.nearbyshops.enduserappnew.EditProfile.FragmentEditProfile;
import org.nearbyshops.enduserappnew.EditShop.EditShopFragment;
import org.nearbyshops.enduserappnew.EditShopImage.EditShopImageFragment;
import org.nearbyshops.enduserappnew.Home;
import org.nearbyshops.enduserappnew.DetailItem.ItemDetailFragment;
import org.nearbyshops.enduserappnew.ImageListForItem.ItemImageListFragment;
import org.nearbyshops.enduserappnew.ItemsByCategory.ItemsByCatFragment;
import org.nearbyshops.enduserappnew.aSellerModule.ItemsDatabase.ItemsDatabaseFragment;
import org.nearbyshops.enduserappnew.aSellerModule.ItemsInShopByCatSeller.ItemsInShopByCatSellerFragment;
import org.nearbyshops.enduserappnew.aSellerModule.ItemsInShopSeller.ItemsInShopFragment;
import org.nearbyshops.enduserappnew.aSellerModule.OrdersInventory.Fragment.OrdersInventoryFragment;
import org.nearbyshops.enduserappnew.aSellerModule.QuickStockEditor.FragmentShopItem;
import org.nearbyshops.enduserappnew.aSellerModule.SelectDeliveryGuy.SelectDeliveryFragment;
import org.nearbyshops.enduserappnew.aSellerModule.ShopAdminHome.ShopAdminHomeFragment;
import org.nearbyshops.enduserappnew.UsersList.UsersListFragment;
import org.nearbyshops.enduserappnew.Transactions.TransactionFragment;
import org.nearbyshops.enduserappnew.ViewHolderSeller.ViewHolderShopItemSeller;
import org.nearbyshops.enduserappnew.ViewHolders.ViewHolderShopItemSimplified;
import org.nearbyshops.enduserappnew.ViewHolders.ViewHolderShopItemSimplifiedBackup;
import org.nearbyshops.enduserappnew.ItemsInShopByCategory.ItemsInShopByCatFragment;
import org.nearbyshops.enduserappnew.Login.LoginFragment;
import org.nearbyshops.enduserappnew.Login.LoginGlobalFragment;
import org.nearbyshops.enduserappnew.Login.LoginUsingOTPFragment;
import org.nearbyshops.enduserappnew.Login.ServiceIndicatorFragment;
import org.nearbyshops.enduserappnew.DetailMarket.MarketDetailFragment;
import org.nearbyshops.enduserappnew.DetailMarket.RateReviewDialogMarket;
import org.nearbyshops.enduserappnew.Markets.MarketsFragment;
import org.nearbyshops.enduserappnew.Markets.MarketsFragmentNew;
import org.nearbyshops.enduserappnew.Markets.SubmitURLDialog;
import org.nearbyshops.enduserappnew.Markets.AdapterMarkets;
import org.nearbyshops.enduserappnew.Markets.ViewHolders.ViewHolderMarket;
import org.nearbyshops.enduserappnew.Markets.ViewHolders.ViewHolderMarketSmall;
import org.nearbyshops.enduserappnew.Markets.ViewModels.MarketViewModel;
import org.nearbyshops.enduserappnew.OneSignal.UpdateOneSignalID;
import org.nearbyshops.enduserappnew.DetailOrder.FragmentOrderDetail;
import org.nearbyshops.enduserappnew.OrderHistory.OrdersHistoryFragment;
import org.nearbyshops.enduserappnew.ProfileFragment;
import org.nearbyshops.enduserappnew.Services.UpdateServiceConfiguration;
import org.nearbyshops.enduserappnew.DetailShop.RateReviewDialog;
import org.nearbyshops.enduserappnew.DetailShop.ShopDetailFragment;
import org.nearbyshops.enduserappnew.ImageListForShop.ShopImageListFragment;
import org.nearbyshops.enduserappnew.ShopsAvailableForItem.Adapter;
import org.nearbyshops.enduserappnew.ShopsAvailableForItem.AdapterBackup;
import org.nearbyshops.enduserappnew.ShopsAvailableForItem.ShopItemFragment;
import org.nearbyshops.enduserappnew.ShopReview.ShopReviewAdapter;
import org.nearbyshops.enduserappnew.ShopReview.ShopReviewStats;
import org.nearbyshops.enduserappnew.ShopReview.ShopReviews;
import org.nearbyshops.enduserappnew.ShopsList.FragmentShopsList;
import org.nearbyshops.enduserappnew.SignUp.ForgotPassword.FragmentCheckResetCode;
import org.nearbyshops.enduserappnew.SignUp.ForgotPassword.FragmentEnterCredentials;
import org.nearbyshops.enduserappnew.SignUp.ForgotPassword.FragmentResetPassword;
import org.nearbyshops.enduserappnew.SignUp.FragmentEmailOrPhone;
import org.nearbyshops.enduserappnew.SignUp.FragmentEnterPassword;
import org.nearbyshops.enduserappnew.SignUp.FragmentVerify;
import org.nearbyshops.enduserappnew.EditShopForAdmin.EditShopForAdminFragment;
import org.nearbyshops.enduserappnew.adminModule.ItemsDatabaseForAdmin.ItemsDatabaseForAdminFragment;
import org.nearbyshops.enduserappnew.adminModule.SelectParent.ItemCategoriesParent;
import org.nearbyshops.enduserappnew.adminModule.SelectParent.ItemCategoriesParentAdapter;
import org.nearbyshops.enduserappnew.adminModule.ShopsList.Fragment.FragmentShopList;


import javax.inject.Singleton;

/**
 * Created by sumeet on 14/5/16.
 */

@Singleton
@Component(modules={AppModule.class, NetModule.class})
public interface NetComponent {


    void Inject(UpdateOneSignalID updateOneSignalID);

    void Inject(Adapter adapter);

    void Inject(ShopItemFragment shopItemFragment);

    void Inject(Home home);

    void Inject(UpdateServiceConfiguration updateServiceConfiguration);

    void Inject(ItemDetailFragment itemDetailFragment);

    void Inject(ItemImageListFragment itemImageListFragment);

    void Inject(LoginGlobalFragment loginGlobalFragment);

    void Inject(LoginUsingOTPFragment loginUsingOTPFragment);

    void Inject(ServiceIndicatorFragment serviceIndicatorFragment);

    void Inject(LoginFragment loginFragment);

    void Inject(OrdersHistoryFragment ordersHistoryFragment);

    void Inject(FragmentOrderDetail fragmentOrderDetail);

    void Inject(ShopDetailFragment shopDetailFragment);

    void Inject(ShopImageListFragment shopImageListFragment);

    void Inject(RateReviewDialog rateReviewDialog);

    void Inject(CartItemAdapter cartItemAdapter);

    void Inject(CartItemListActivity cartItemListActivity);

    void Inject(CartsListFragment cartsListFragment);

    void Inject(PlaceOrderActivity placeOrderActivity);

    void Inject(FragmentShopsList fragmentShopsList);

    void Inject(EditAddressFragment editAddressFragment);

    void Inject(DeliveryAddressActivity deliveryAddressActivity);

    void Inject(RateReviewDialogMarket rateReviewDialogMarket);

    void Inject(MarketDetailFragment marketDetailFragment);

    void Inject(AdapterMarkets adapterMarkets);

    void Inject(ViewHolderMarketSmall viewHolderMarketSmall);

    void Inject(ViewHolderMarket viewHolderMarket);

    void Inject(MarketViewModel marketViewModel);

    void Inject(MarketsFragment marketsFragment);

    void Inject(SubmitURLDialog submitURLDialog);

    void Inject(MarketsFragmentNew marketsFragmentNew);

    void Inject(FragmentChangePassword fragmentChangePassword);

    void Inject(FragmentChangeEmail fragmentChangeEmail);

    void Inject(FragmentVerifyEmail fragmentVerifyEmail);

    void Inject(FragmentChangePhone fragmentChangePhone);

    void Inject(FragmentVerifyPhone fragmentVerifyPhone);

    void Inject(FragmentEditProfile fragmentEditProfile);

    void Inject(ProfileFragment profileFragment);

    void Inject(ShopReviews shopReviews);

    void Inject(ShopReviewAdapter shopReviewAdapter);

    void Inject(ShopReviewStats shopReviewStats);

    void Inject(FragmentEmailOrPhone fragmentEmailOrPhone);

    void Inject(FragmentVerify fragmentVerify);

    void Inject(FragmentEnterPassword fragmentEnterPassword);

    void Inject(FragmentEnterCredentials fragmentEnterCredentials);

    void Inject(FragmentCheckResetCode fragmentCheckResetCode);

    void Inject(FragmentResetPassword fragmentResetPassword);


    void Inject(ItemsByCatFragment itemsByCatFragment);

    void Inject(ItemsInShopByCatFragment itemsInShopByCatFragment);


    void Inject(ViewHolderShopItemSimplified viewHolderShopItemSimplified);

    void Inject(ViewHolderShopItemSimplifiedBackup viewHolderShopItemSimplifiedBackup);

    void Inject(AdapterBackup adapterBackup);

    void Inject(ViewHolderShopItemSeller viewHolderShopItemSeller);

    void Inject(org.nearbyshops.enduserappnew.aSellerModule.ItemsInShopByCatSeller.Adapter adapter);

    void Inject(ItemsInShopFragment itemsInShopFragment);

    void Inject(ItemsDatabaseFragment itemsDatabaseFragment);

    void Inject(ItemsInShopByCatSellerFragment itemsInShopByCatSellerFragment);

    void Inject(OrdersInventoryFragment ordersInventoryFragment);

    void Inject(UsersListFragment usersListFragment);

    void Inject(SelectDeliveryFragment selectDeliveryFragment);

    void Inject(FragmentShopItem fragmentShopItem);

    void Inject(ShopAdminHomeFragment shopAdminHomeFragment);

    void Inject(EditShopFragment editShopFragment);

    void Inject(EditShopImageFragment editShopImageFragment);

    void Inject(TransactionFragment transactionFragment);

    void Inject(EditItemImageFragment editItemImageFragment);

    void Inject(EditItemFragmentNew editItemFragmentNew);

    void Inject(FragmentAddCredit fragmentAddCredit);

    void Inject(AdminDashboardFragment adminDashboardFragment);

    void Inject(EditConfigurationFragment editConfigurationFragment);

    void Inject(EditShopForAdminFragment editShopForAdminFragment);

    void Inject(ItemsDatabaseForAdminFragment itemsDatabaseForAdminFragment);

    void Inject(EditItemCategoryFragment editItemCategoryFragment);

    void Inject(ItemCategoriesParentAdapter itemCategoriesParentAdapter);

    void Inject(ItemCategoriesParent itemCategoriesParent);

    void Inject(FragmentShopList fragmentShopList);

    void Inject(EditStaffPermissionsFragment editStaffPermissionsFragment);

    void Inject(EditShopStaffPermissionsFragment editShopStaffPermissionsFragment);

    void Inject(AddUserToStaffDialog addUserToStaffDialog);

    void Inject(DeliveryInventoryFragment deliveryInventoryFragment);
}

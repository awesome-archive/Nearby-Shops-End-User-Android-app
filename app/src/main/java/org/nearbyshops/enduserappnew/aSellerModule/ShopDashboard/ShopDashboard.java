package org.nearbyshops.enduserappnew.aSellerModule.ShopDashboard;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import org.nearbyshops.enduserappnew.Model.Shop;
import org.nearbyshops.enduserappnew.aSellerModule.ItemsDatabase.ItemsDatabase;
import org.nearbyshops.enduserappnew.aSellerModule.ItemsInShopByCatSeller.ItemsInShopByCat;
import org.nearbyshops.enduserappnew.aSellerModule.ItemsInShopSeller.ItemsInShop;
import org.nearbyshops.enduserappnew.OrderHistory.OrderHistory;
import org.nearbyshops.enduserappnew.OrderHistory.OrdersHistoryFragment;
import org.nearbyshops.enduserappnew.aSellerModule.OrdersInventory.HomeDeliveryInventory.HomeDelivery;
import org.nearbyshops.enduserappnew.aSellerModule.OrdersInventory.PickFromShopInventory.PickFromShopInventory;
import org.nearbyshops.enduserappnew.PreferencesDeprecated.PrefShopHome;
import org.nearbyshops.enduserappnew.aSellerModule.QuickStockEditor.QuickStockEditor;
import org.nearbyshops.enduserappnew.R;
import org.nearbyshops.enduserappnew.UsersList.UsersList;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ShopDashboard extends AppCompatActivity {

    public static final String SHOP_ID_INTENT_KEY = "shop_id_key";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_home);
        ButterKnife.bind(this);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setupNotifications();
    }







    @OnClick(R.id.option_orders)
    void ordersClick()
    {

            startActivity(new Intent(this, HomeDelivery.class));
    }





    @OnClick(R.id.option_orders_pick_from_shop)
    void ordersPickFromShop()
    {
//        startActivity(new Intent(this, OrdersPickFromShop.class));
        startActivity(new Intent(this, PickFromShopInventory.class));
    }




    @OnClick(R.id.shop_home_order_history)
    void orderHistory()
    {

        Intent intent = new Intent(this, OrderHistory.class);
        intent.putExtra(OrdersHistoryFragment.IS_FILTER_BY_SHOP,true);

        startActivity(intent);
    }








    @OnClick(R.id.shop_home_quick_stock_editor)
    void quickStockEditorClick(View view)
    {
        startActivity(new Intent(this, QuickStockEditor.class));

    }






    @OnClick(R.id.option_edit_stock)
    void editStockClick(View view)
    {
//        startActivity(new Intent(this, EditStock.class));
        startActivity(new Intent(this, ItemsInShopByCat.class));
    }

//    @OnClick(R.id.option_billing)
//    void billingClick(View view)
//    {
//        showToastMessage("Feature coming soon !");
//    }

//    @OnClick(R.id.option_shop_stats)
//    void optionShopStats()
//    {
//        showToastMessage("Feature coming soon !");
//    }






    @OnClick(R.id.option_delivery_guy_accounts)
    void DeliveryAccountsClick(View view)
    {
//        startActivity(new Intent(this, DeliveryGuyAccounts.class));
        startActivity(new Intent(this, UsersList.class));
    }




    @OnClick(R.id.option_add_items)
    void optionItemsByCategory()
    {
        startActivity(new Intent(this, ItemsDatabase.class));
    }



    @OnClick(R.id.option_items_in_stock)
    void optionItemsInStock()
    {
        startActivity(new Intent(this, ItemsInShop.class));
    }








    @OnClick(R.id.option_staff_accounts)
    void optionStaffAccounts()
    {
        startActivity(new Intent(this, UsersList.class));
    }




    void setupNotifications()
    {
        Shop shop = PrefShopHome.getShop(this);

        if(shop!=null)
        {
            int currentapiVersion = Build.VERSION.SDK_INT;

            if (currentapiVersion >= Build.VERSION_CODES.KITKAT){
                // Do something for lollipop and above versions

//                Intent intent = new Intent(this, SSEIntentService.class);
//                intent.putExtra(SSEIntentService.SHOP_ID, shop.getShopID());
//                startService(intent);
            }
        }
    }




    void showToastMessage(String message)
    {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

}

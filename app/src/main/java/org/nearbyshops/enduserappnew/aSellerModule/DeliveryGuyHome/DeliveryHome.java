package org.nearbyshops.enduserappnew.aSellerModule.DeliveryGuyHome;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import org.nearbyshops.enduserappnew.R;
import org.nearbyshops.enduserappnew.aSellerModule.ShopAdminHome.ShopAdminHomeFragment;


public class DeliveryHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_container);

        if(savedInstanceState==null)
        {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container,new DeliveryGuyHomeFragment())
                    .commitNow();
        }

    }
}

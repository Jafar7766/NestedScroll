package com.example.taskthree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView bestRecyclerView = findViewById(R.id.productList);
        GridLayoutManager mGrid = new GridLayoutManager(this, 2);
        bestRecyclerView.setLayoutManager(mGrid);
        bestRecyclerView.setHasFixedSize(true);
        PhoneAdapter mAdapter = new PhoneAdapter(MainActivity.this, getProductTestData());
        bestRecyclerView.setAdapter(mAdapter);
    }
    private List<ProductObject> getProductTestData() {
        List<ProductObject> featuredProducts = new ArrayList<>();
        featuredProducts.add(new ProductObject("Iphone 6", "iphone2"));
        featuredProducts.add(new ProductObject("Iphone 6S", "iphone2"));
        featuredProducts.add(new ProductObject("Iphone 8S", "iphone2"));
        featuredProducts.add(new ProductObject("Iphone X", "iphone2"));
        featuredProducts.add(new ProductObject("Iphone XR", "iphone2"));
        featuredProducts.add(new ProductObject("Iphone XS", "iphone2"));
        return featuredProducts;
    }
}
package com.example.sqlite;

public class Products {

    private int  _id;
    private String _productname;

    public Products () {
    }

    public Products(String productname) {
        this._productname = productname;
    }

    public int get_id() {
        return _id;
    }

    public String get_productname() {
        return _productname;
    }

    public void set_productName(String _productname) {
        this._productname = _productname;
    }

    public void set_id(int _id) {
        this._id = _id;


    }
}
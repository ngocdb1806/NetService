var BASE_API_URL = "http://172.16.7.180:8080";
var LOGIN_URL = "login";
var CUSTOMER_URL = "customer";
var ORDER_URL = "order";
var ORDER_WEB_URL = "order-web";
var INVENTORY_URL = "inventory";
var STAFF_URL = "staff";
var STAFF_WEB_URL = "staff/web";

var GOOGLE_API_KEY = "AIzaSyBzgvkqSdA28vGw5qvqgJdPp-3_8YEBzFo";
var RECIPE_LEVEL_ENUM = ["", "Dễ", "Trung bình", "Khó"];

var STORE_ID = 1;

var getTempDatas = (function() {
    var getAllProducts = [
        {
          "costPrice": 10000,
          "description": "1 goi mi voi 50g bo",
          "groupProductId": 1,
          "id": 1,
          "productName": "Mi goi bo",
          "quantityInStock": 1000,
          "salePrice": 15000,
          "status": true,
          "storeId": 1,
          "typeOrder": "DIRECTLY"
        },
        {
          "costPrice": 12000,
          "description": "2 goi mi voi 50g bo",
          "groupProductId": 1,
          "id": 2,
          "productName": "Mi goi bo 2 goi",
          "quantityInStock": 1000,
          "salePrice": 20000,
          "status": true,
          "storeId": 1,
          "typeOrder": "DIRECTLY"
        },
    ];
    var getAllGoods = [
        {
            "id": 1,
            "goodName": "mi goi",
            "description": "",
            "costPrice": 2000,
            "nameUnit": "migoi01",
            "basicUnitId": 1,
            "exchangeValue": 1,
            "quantityInStock": "1000.000",
            "status": "1",
            "remove": false
        },
        {
            "id": 2,
            "goodName": "bo",
            "description": "",
            "costPrice": 8000,
            "nameUnit": "g",
            "basicUnitId": 1,
            "exchangeValue": 50,
            "quantityInStock": "5000.000",
            "status": "1",
            "remove": false
        }
    ];
    var getAllCustomers = [
      {
        "id": 1,
        "storeId": 1,
        "firstName": "Cung",
        "lastName": "Nguyen",
        "birthDate": {
          "year": 1997,
          "month": "APRIL",
          "chronology": {
            "id": "ISO",
            "calendarType": "iso8601"
          },
          "era": "CE",
          "dayOfMonth": 9,
          "dayOfWeek": "WEDNESDAY",
          "dayOfYear": 99,
          "leapYear": false,
          "monthValue": 4
        },
        "address": "14/1c ",
        "phone": 392423134,
        "rewardPoints": "100.00"
      }
    ];

    var getOrderCreateModel = {
      "customerId": 0,
      "customerStoreId": 0,
      "id": 0,
      "orderDate": "2019-03-22T14:27:37.188Z",
      "orderDetails": [
        {
          "discount": 0,
          "id": 0,
          "orderCustomerId": 0,
          "orderId": 0,
          "orderStaffId": 0,
          "productId": 0,
          "productName": "string",
          "quantity": 0,
          "typeOrder": "string",
          "unitPrice": 0
        }
      ],
      "staffId": 0,
      "status": "string"
    };

    var getAllStaffs = [
        {
            "id":1,
            "storeId":1,
            "nameStore":"Net Sieu Toc",
            "firstName":"Ngoc",
            "lastName":"Dao",
            "birthDate":"1997-10-02",
            "address":"14/1",
            "phone":9090909,
            "photo":"123",
            "status":"1",
            "email":"admin",
            "fullName":"Dao Bao Ngoc",
            "password":"123456",
            "role":"1",
            "workingShift":"8h-17h"
        }
    ];

    return {
        GetAllGoods: getAllGoods,
        GetAllCustomer: getAllCustomers,
        GetOrderCreateModel: getOrderCreateModel,
        GetAllProducts: getAllProducts,
        GetAllStaffs: getAllStaffs
    };

})();
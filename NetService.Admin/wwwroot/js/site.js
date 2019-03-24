srsn = {} || srsn;
srsn.Utils = {} || srsn.Utils;

srsn.Utils = {
    GetCurrentLogin: function() {
        var localStorageUserLogin = localStorage.getItem("authorization");
        var result = JSON.parse(localStorageUserLogin);
        if (result == {}) {
            return null;
        }
        return result;
    },
    SetCurrentLogin: function (authorization, username="") {
        var result = JSON.stringify(authorization);
        localStorage.setItem("authorization", result);
        localStorage.setItem("username", username);
    },
    HandleResException: function (ex) {
        if (ex.status === 400) {
            localStorage.setItem("authorization", "");
            window.location.href = "/login";
        }
    },
    CreateOrder: async function (orderDTO) {
        if (orderDTO) {
            //orderDTO.orderDate = (new Date()).toLocaleDateString();
            var response = await fetch(`${BASE_API_URL}/${ORDER_URL}/create`, {
                method: 'POST',
                headers: {
                  'Accept': 'application/json',
                  'Content-Type': 'application/json'
                },
                body: JSON.stringify({...orderDTO})
            });
            var data = await response.json();

            return data;
        }
        return null;
    },
    GetAllOrders: async function (fromDate, toDate) {
        try {
            var response = await fetch(`${BASE_API_URL}/${ORDER_WEB_URL}/get-bill/date?fromDate=${fromDate}&toDate=${toDate}`);
            var data = await response.json();
    
            return data;
        } catch (e) {
            return null;
        }
    },
    GetAllStaff: async function () { 
        try {
            var response = await fetch(`${BASE_API_URL}/${STAFF_WEB_URL}/getAll`);
            var data = await response.json();
    
            return data;
        } catch (e) {
            return null;
        }
    
    }
};


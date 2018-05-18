/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function UserAction() {
    var user = {
        "name": $("#name").val(),
        "address": $("#address").val()
    }



    $.ajax({
        type: "POST", //GET or POST or PUT or DELETE verb
        url: 'http://localhost:8080/Curd/add', // Location of the service
        data: JSON.stringify(user), //Data sent to server
        contentType: "application/json; charset=utf-8", // content type sent to server
        dataType: "text", //Expected data format from server
        success: function (response) { //On Successfull service call
            console.log(response);
            window.location.href = response;
        }
        // When Service call fails
    });

    /* $.ajax({
     url: 'http://localhost:8080/Curd/add/',
     dataType: 'json',
     contentType: 'application/json; charset=UTF-8',
     type: 'POST',
     data: JSON.stringify(user),
     beforeSend: function () {
     //do something before send (e.g. show a message like: please wait)
     },
     complete: function () {
     //do something after sent (e.g. remove the message please wait)
     },
     success: function (data) {
     //handle the success response 
     console.log(data);
     },
     error: function (data) {
     //handle the error response 
     }
     });
     */

}


function getuserlist() {

    var res;
    $.ajax({
        type: "GET",
        url: 'http://localhost:8080/Curd/userList',
        async: false,
        dataType: "json", //Expected data format from server

        success: function (response) {
            console.log(response);
            //debugger;
            res = response;
            for (var i = 0; i < res.length; i++) {
                tr = $('<tr/>');
                tr.append("<td>" + res[i].sno + "</td>");
                tr.append("<td>" + res[i].name + "</td>");
                tr.append("<td>" + res[i].address + "</td>");
                $('table').append(tr);
            }

        },
        error: function (response) {
            console.log(response);
        }
    });

}



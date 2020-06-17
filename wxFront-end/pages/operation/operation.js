// pages/opration/opration.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    id:undefined,
    areaName:'',
    priority:'',
    addUrl:'http://192.168.2.120:8080/area',
    updateUrl:'http://192.168.2.120:8080/area'
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    //options为页面跳转带来的参数
    var that = this;
    if(options.id != undefined){
      //console.log(options);
      //若是由编辑按钮跳转过来的
      that.setData({
        id:options.id
      });
      wx.request({
        url: 'http://192.168.2.120:8080/area/id',
        data: {'id':options.id},
        method: 'GET',
        success: function(res) {
          console.log(res);
          var result = res.data.success;
          if(result){
            that.setData({
              areaName: res.data.data.areaName,
              priority: res.data.data.priority
            });
          }else{
            wx.showToast({
              title: '请求失败'+res.data.msg,
              duration: 2000,
            });
          }
        },
      })
    }
  },


  formSubmit:function(e){
    var that = this;
    var sendMenthod = "POST"
    //console.log("e: "+e)???
    //获取表单值
    var formData = e.detail.value;
    //var formData = e;
    var url = this.data.addUrl;
    if(this.data.id != undefined){
      //如果是编辑按钮跳转
        formData.areaId = this.data.id; 
        url = this.data.updateUrl;
        sendMenthod = "PUT"
    }
    console.log("json: "+JSON.stringify(formData));

    wx.request({
      url: url,
      //将其转换成JSON
      data: JSON.stringify(formData),
      method: sendMenthod,
      success: function(res) {
        console.log(res);
        
        var result = res.data.success;
        var toastText = '请求成功';
        if(!result){
          toastText = '失败'+res.data.msg;
        }
        wx.showToast({
          title: toastText,
          duration: 2000,
        })
        if(result){
          wx.reLaunch({
            //操作结束后跳转回列表页
            url: '../list/list',
          })
        }
      },
    })
  }
})
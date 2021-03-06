$().ready(function () {
    validateRule();
});

$.validator.setDefaults({
    submitHandler: function () {
        save();
    }
});
function save() {
    $.ajax({
        cache: true,
        type: "POST",
        url: "/demoStu/stuinfo/save",
        data: $('#signupForm').serialize(),// 你的formid
        async: false,
        error: function (request) {
            alert($('#sbirthday').val());
            parent.layer.alert("Connection error");
        },
        success: function (data) {
            if (data.code == 0) {
                parent.layer.msg("操作成功");
                parent.reLoad();
                var index = parent.layer.getFrameIndex(window.name); // 获取窗口索引
                parent.layer.close(index);

            } else {
                parent.layer.alert(data.msg)
            }

        }
    });

}
function validateRule() {
    var icon = "<i class='fa fa-times-circle'></i> ";
    $("#signupForm").validate({
        rules: {
            name: {
                required: true
            }
        },
        messages: {
            name: {
                required: icon + "请输入姓名"
            }
        }
    })
}
//如果用datetimepicker组件,复制过去粘贴即可
//https://www.bootcss.com/p/bootstrap-datetimepicker/index.htm
$('.timeOne').datetimepicker({
    language:  'zh-CN',                 //语言
    format: 'yyyy-mm-dd hh:ii:ss',      //日期格式
    weekStart: 1,                       //一周从哪一天开始
    //startDate:,                       //Date. 默认值：开始时间
    //endDate:,                         //Date. 默认值：结束时间
    todayBtn:  true,                    //当日按钮
    autoclose: true,                    //选择一个日期之后是否立即关闭
    todayHighlight: 1,                  //高亮当前日期
    startView: 2,                       //优先视图:0 hour 1 day 2 month 3year 4decade
    forceParse: false,                  //强制解析输入框中的值
    showMeridian: 1                     //此选项将为日视图和小时视图启用子午线视图
});
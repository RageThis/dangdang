<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/css.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/easyui.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/icon.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui-lang-zh_CN.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<div>
    <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls: 'icon-add'" onclick="addss()">添加</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls: 'icon-edit'"
       onclick="updatesss()">修改</a>
    <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls: 'icon-remove'" onclick="delectsss()">删除</a>
    <table id="prodatagrid"></table>
</div>
<div id="addProdia" class="easyui-dialog" data-options="closed:true">
    <form id="prof1" style="margin:30px" enctype="multipart/form-data" method="post">
        <table>
            <tr>
                <td>
                    图书名字：<input class="easyui-validatebox" name="book_Name"
                                data-options="required:true,missingMessage:'请填写商品名字'"/><br/><br/>
                    图书封面：<input class="easyui-filebox" name="uploadFile"
                                data-options="required:true,missingMessage:'请选择封面'"/><br/><br/>
                </td>
                <td>
                    图书原价：<input class="easyui-validatebox" name="book_Price" type="number" step="0.1"
                                data-options="required:true,missingMessage:'请输入价格'"/> <br/><br/>
                    当当价格：<input class="easyui-validatebox" name="dangPrice" type="number" step="0.1"
                                data-options="required:true,missingMessage:'请输入价格'"/><br/><br/>
                </td>
            </tr>
            <tr>
                <td>
                    <%--库存：&nbsp;&nbsp;<input class="easyui-validatebox"  name="inventory" data-options="required:true,missingMessage:'请输入库存'"/><br/><br/>--%>
                    作者：&nbsp;&nbsp;<input class="easyui-validatebox" name="author"
                                          data-options="required:true,missingManage:'请输入作者名称'"/><br/><br/>
                </td>
                <td>
                    出版社：&nbsp;<input class="easyui-validatebox" name="press"
                                     data-options="required:true,missingManage:'请输入出版社名称'"/><br/>
                    &nbsp;<%--销量：&nbsp;&nbsp;<input class="easyui-validatebox"  type="number" name="salenum" data-options="required:true,missManage:'请输入销量记录'" /><br/><br/>--%>
                </td>
            </tr>
            <tr><%--<td>
		顾客评分：<input class="easyui-validatebox"  name="custome_score" data-options="required:true,missingManage:'请输入顾客评分'"/><br/><br/>
		编辑推荐：<input class="easyui-validatebox"  name="recommend" data-options="required:true,missManager:'请输入编辑推荐'"><br/><br/>
		</td>--%>
                <td>
                    类别所属：<select id="prosele1" name="cid"></select><br/><br/>
                    <%--简介内容：<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea rows="5" cols="22" name="messages" ></textarea><br/><br/>--%>
                </td>
            </tr>
        </table>
        <center>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" onClick="pro1()">确认</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel">取消</a>
        </center>
    </form>
</div>
<div id="updateProdia" class="easyui-dialog" data-options="closed:true">
    <form id="prof2" style="margin:30px" enctype="multipart/form-data" method="post">
        <table>
            <tr>
                <td>
                    <input id="proId" name="book_Id" type="hidden"/>
                    图书名字：<input class="easyui-validatebox" id="proName" name="book_Name"
                                data-options="required:true,missingMessage:'请填写商品名字'"/><br/><br/>
                    <%--图书封面：<input class="easyui-filebox"  name="uploadFile" data-options="required:true,missingMessage:'请选择封面'"/><br/><br/>--%>
                </td>
                <td>
                    图书原价：<input class="easyui-validatebox" id="proPrice" name="book_Price" type="number" step="0.1"
                                data-options="required:true,missingMessage:'请输入价格'"/> <br/><br/>
                    当当价格：<input class="easyui-validatebox" id="dangPrice" name="dangPrice" type="number" step="0.1"
                                data-options="required:true,missingMessage:'请输入价格'"/><br/><br/>
                </td>
            </tr>
            <tr>
                <td colspan="2"><p id="image"></p></td>
            </tr>
            <tr>
                <td>
                    <%--库存：&nbsp;&nbsp;<input class="easyui-validatebox" id="inventory" name="inventory" data-options="required:true,missingMessage:'请输入库存'"/><br/><br/>--%>
                    作者：&nbsp;&nbsp;<input class="easyui-validatebox" id="author" name="author"
                                          data-options="required:true,missingManage:'请输入作者名称'"/><br/><br/>
                </td>
                <td>
                    出版社：&nbsp;<input class="easyui-validatebox" id="press" name="press"
                                     data-options="required:true,missingManage:'请输入出版社名称'"/><br/>
                    <%--销量：&nbsp;&nbsp;<input class="easyui-validatebox" id="salenum" type="number" name="salenum" data-options="required:true,missManage:'请输入销量记录'" /><br/><br/>--%>
                </td>
            </tr>
            <tr>
                <td>
                    <%--顾客评分：<input class="easyui-validatebox" id="custome_core" name="custome_score" data-options="required:true,missingManage:'请输入顾客评分'"/><br/><br/>
                    编辑推荐：<input class="easyui-validatebox" id="recommend" name="recommend" data-options="required:true,missManager:'请输入编辑推荐'"><br/><br/>--%>
                </td>
                <td>
                    <%--类别所属：<select id="prosele" name="cid"><option>a</option></select><br/><br/>--%>
                    <%--简介内容：<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<textarea rows="5" cols="22" name="messages" id="messages"></textarea><br/><br/>--%>
                </td>
            </tr>
        </table>
        <center>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" onClick="pro();">确认</a>
            <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onClick="exit();">取消</a>
        </center>
    </form>
</div>
<script type="text/javascript">
    $(function () {
        $.ajax({
            url: "${pageContext.request.contextPath}/getAll",
            async: false,
            success: function (data) {
                var list = data.list;
                for (var i = 0; i < list.length; i++) {
                    //alert(ilist[i].o_option+ilist[i].o_id);
                    $("#prosele1").append("<option value='" + list[i].category_Id + "'>" + list[i].category_Name + "</option>");
                    $("#prosele2").append("<option value='" + list[i].category_Id + "'>" + list[i].category_Name + "</option>");
                }

            },
            //dataType:"json"
        });
        $("#prodatagrid").datagrid({
            url: "${pageContext.request.contextPath}/selectAll",
            pagination: true,
            columns: [[
                {checkbox: true, field: ""},
                {title: "图书编号", field: "book_Id"},
                {title: "图书名称", field: "book_Name", width: 200},
                {title: "图书价格", field: "book_Price"},
                {title: "出版社", field: "press"},
                {title: "类型", field: "cg[0].category_Name", width: 200}
            ]],
        });
    })

    function addss() {
        $.ajax({
            url: "${pageContext.request.contextPath}/getAll",
            async: false,
            success: function (data) {
                var list = data.list;
                alert(list.length);
                for (var i = 0; i < list.length; i++) {
                    //alert(ilist[i].o_option+ilist[i].o_id);
                    $("#prosele1").append("<option value='" + list[i].category_Id + "'>" + list[i].category_Name + "</option>");
                    $("#prosele0").append("<option value='" + list[i].category_Id + "'>" + list[i].category_Name + "</option>");
                    if (i + 1 == list.length) {
                        $("#addProdia").dialog({
                            closed: false,
                        });
                    }
                }

            },
            //dataType:"json"
        });

    };

    function updatesss() {
        var scxz = $("#prodatagrid").datagrid("getSelections");
        if (scxz.length == 1) {
            $.ajax({
                url: "${pageContext.request.contextPath}/selectOne",
                async: false,
                data: {"id": scxz[0].book_Id},
                success: function (data) {
                    $("#proId").val(data.book_Id);
                    $("#proName").val(data.book_Name);
                    $("#proPrice").val(data.book_Price);
                    $("#dangPrice").val(data.dangPrice);
                    $("#author").val(data.author);
                    $("#press").val(data.press);
                    $("#updateProdia").dialog({
                        closed: false,
                    });
                },
                //dataType:"json"
            });
        }

    };

    function pro1() {
        $("#prof1").form("submit", {
            url: "${pageContext.request.contextPath}/insert",
            /*onSubmit:function(){
                var logOk = $(this).form("validate");
                return logOk;
            },*/
            success: function (data) {
                data = JSON.parse(data);
                if (data) {
                    alert("添加成功")
                    $("#prodatagrid").datagrid("load");
                    $("#addProdia").dialog("close");
                } else {
                    alert("添加失败")
                }
            }
        });
    };

    function delectsss() {
        var scxz = $("#prodatagrid").datagrid("getSelections");
        //alert(scxz[0].book_Id);
        if (scxz.length == 0) {
            $.messager.alert("删除提示", "请选择您要删除的数据", "warning");
        } else {
            $.messager.confirm("删除提示", "您确定要删除您选中的数据吗？", function (result) {
                if (result) {
                    var ids = new Array(scxz.length);
                    for (var i = 0; i < scxz.length; i++) {
                        ids[i] = scxz[i].book_Id;
                    }
                    $.ajax({
                        url: "${pageContext.request.contextPath}/deleteByIds",
                        data: "ids=" + ids,
                        traditional: true,
                        success: function (data) {
                            if (data) {
                                $.messager.show({
                                    title: "删除提示",
                                    msg: "删除成功",
                                    showSpeed: 5000,
                                    showType: "fade"
                                });
                                $("#prodatagrid").datagrid("reload");
                            } else {
                                $.messager.show({
                                    title: "删除提示",
                                    msg: "删除失败",
                                    showSpeed: 5000,
                                    showType: "fade"
                                });
                            }
                        },
                    });
                }
            });
        }
    };

    function pro() {
        $("#prof2").form("submit", {
            url: "${pageContext.request.contextPath}/update",
            /*onSubmit:function(){
                var logOk = $(this).form("validate");
                return logOk;
            },*/
            success: function (data) {
                data = JSON.parse(data);
                alert(data);
                if (data) {
                    alert("修改成功");
                    $("#prodatagrid").datagrid("load");
                    $("#updateProdia").dialog("close");
                } else {

                    alert("修改失败");
                }
            }
        });
    };
</script>
</body>
</html>
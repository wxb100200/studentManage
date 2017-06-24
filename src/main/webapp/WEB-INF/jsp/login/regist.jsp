<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="loginHead.jsp"%>
<div id="content">
    <p id="whereami">
    </p>
    <h1>
        注册
    </h1>
    <form action="login.html" method="post">
        <table cellpadding="0" cellspacing="0" border="0"
            class="form_table">
            <tr>
                <td valign="middle" align="right">
                    用户名:
                </td>
                <td valign="middle" align="left">
                    <input type="text" class="inputgri" name="username" />
                </td>
            </tr>
            <tr>
                <td valign="middle" align="right">
                    真实姓名:
                </td>
                <td valign="middle" align="left">
                    <input type="text" class="inputgri" name="name" />
                </td>
            </tr>
            <tr>
                <td valign="middle" align="right">
                    密码:
                </td>
                <td valign="middle" align="left">
                    <input type="password" class="inputgri" name="pwd" />
                </td>
            </tr>
            <tr>
                <td valign="middle" align="right">
                    性别:
                </td>
                <td valign="middle" align="left">
                    男
                    <input type="radio" class="inputgri" name="sex" value="m" checked="checked"/>
                    女
                    <input type="radio" class="inputgri" name="sex" value="f"/>
                </td>
            </tr>

            <tr>
                <td valign="middle" align="right">
                    验证码:
                    <img id="num" src="image" />
                    <a href="javascript:;" onclick="document.getElementById('num').src = 'image?'+(new Date()).getTime()">换一张</a>
                </td>
                <td valign="middle" align="left">
                    <input type="text" class="inputgri" name="number" />
                </td>
            </tr>
        </table>
        <p>
            <input type="submit" class="button" value="确认" />
        </p>
    </form>
</div>
<%@include file="loginFoot.jsp"%>

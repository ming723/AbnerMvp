# AbnerMvp【作者：AbnerMing,微信公众号：HelloAbner】

### vipmvp库具体使用说明：
    vipmvp是一个轻量级的RxJava + Retrofit + mvp模式的Android框架，联网逻辑简单实用，可自己控制携带头部信息，加载动画，MVP模式使得View视图和控制器完全分离，代码之间简洁明了。

    vipmvp依赖于dialog库，dialog库只用了其中的菊花加载，其实里面也有好多弹出框样式，具体使用可翻阅代码。

### 初始化：
      直接继承AbnerApplication，或者自己在Application或者其它主入口中写入：
     StyledDialog.init(this);
     HttpUtils.getmHttpUtils().create();
###  主要类说明：
    BaseActivity：Activity中没有网络请求可集成此类
    BaseActivityHttp：Activity中有网络请求可集成此类
    BaseFragment：Fragment没有网络请求可集成此类
    BaseFragmentHttp：Fragment有网络请求可集成此类

    HttpApi：域名管理类，多个域名均可写在这里
    Helper：联网请求类，不是继承BaseActivityHttp或者BaseFragmentHttp类的，均可单独使用
###  部分父类方法说明：
    showBack：是否显示返回键
    baseTitle：展示页面标题
    如果父类头部需要更多的信息，如右侧menu，可以自己设置。
###  注意：
    1、Activity或者Fragment实现MVP模式：主要继承ActivityPresenter或者FragmentPresenter
    2、Activity或者Fragment实现MVP模式如果要绑定数据可以继承：ActivityDataBind或者FragMentDataBind

 ###  主要代码：详见demo1，demo2,httptest包下
    demo1：正常的MVP
    demo2：数据绑定的MVP
    httptest：如何请求网络数据

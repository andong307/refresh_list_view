package cn.itcast.refreshlistview_wh03.view;

public interface OnRefreshListener {

	/**
	 * ��������ˢ��ʱ, �ص��˷���, ����ˢ�����ݵĲ���
	 */
	public void OnPullDownRefresh();

	/**
	 * ��ǰ�Ǽ��ظ���Ĳ���.
	 */
	public void onLoadingMore();
}

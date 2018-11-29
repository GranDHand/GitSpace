package stgl.domain;

	public class Stgl_message {
		private int m_id;
		private String m_content;
		private String m_stu_name;
		private String ass_id;
		public Stgl_message(int m_id, String m_content, String m_stu_name, String ass_id) {
			super();
			this.m_id = m_id;
			this.m_content = m_content;
			this.m_stu_name = m_stu_name;
			this.ass_id = ass_id;
		}
		public Stgl_message() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getM_id() {
			return m_id;
		}
		public void setM_id(int m_id) {
			this.m_id = m_id;
		}
		public String getM_content() {
			return m_content;
		}
		public void setM_content(String m_content) {
			this.m_content = m_content;
		}
		public String getM_stu_name() {
			return m_stu_name;
		}
		public void setM_stu_name(String m_stu_name) {
			this.m_stu_name = m_stu_name;
		}
		public String getAss_id() {
			return ass_id;
		}
		public void setAss_id(String ass_id) {
			this.ass_id = ass_id;
		}
		@Override
		public String toString() {
			return "Stgl_message [m_id=" + m_id + ", m_content=" + m_content + ", m_stu_name=" + m_stu_name
					+ ", ass_id=" + ass_id + "]";
		}
		
}

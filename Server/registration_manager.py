import pymysql.cursors

def add_user(reg_info):
    connection = pymysql.connect(host='127.0.0.1',
                                user='admin',
                                password='1234',
                                database='test',
                                charset='utf8mb4',
                                cursorclass=pymysql.cursors.DictCursor)
    try:
        with connection.cursor() as cursor:
            sql = "INSERT INTO users (name, lastname, number, email, password, standing) VALUES (%s, %s, %s, %s, %s, %s)"
            cursor.execute(sql, (reg_info['name'], reg_info['lastname'], reg_info['number'], reg_info['email'], reg_info['password'], "active"))
         
        connection.commit()
    finally:
        connection.close();

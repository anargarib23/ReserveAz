from flask import Flask, request, render_template, redirect, jsonify
import pymysql.cursors

from registration_manager import add_user

app = Flask(__name__)

if __name__ == "__main__":
    app.run(host='0.0.0.0')
    
    
@app.route('/login', methods=['GET', 'POST'])
def login():
    req_data = request.get_json()
    return 'Hello ' + str(req_data['name'])
  
@app.route('/register', methods=['GET', 'POST']) 
def register():
    req_data = request.get_json()
    add_user(req_data)
    return '1'